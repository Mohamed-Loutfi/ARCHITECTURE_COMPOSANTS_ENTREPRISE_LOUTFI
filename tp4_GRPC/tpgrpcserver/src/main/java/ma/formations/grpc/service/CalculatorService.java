package ma.formations.grpc.service;

import io.grpc.stub.StreamObserver;
import ma.formations.grpc.stubs.Calculator;
import ma.formations.grpc.stubs.CalculatorServiceGrpc;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class CalculatorService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(Calculator.UnaryRequest request, StreamObserver<Calculator.UnaryResponse> responseObserver) {
        double a = request.getA();
        double b = request.getB();
        double result = a + b;
        Calculator.UnaryResponse response = Calculator.UnaryResponse.newBuilder().
                setA(a).
                setB(b).
                setResult(result).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getOperationStream(Calculator.ServerStreamRequest request, StreamObserver<Calculator.ServerStreamResponse> responseObserver) {
        double a = request.getA();
        double b = request.getB();


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            String type = "No operation is performed by the server";
            int counter = 0;
            double result = -1;

            @Override
            public void run() {
                if (counter == 0) {
                    result = a + b;
                    type = "a + b";
                }

                if (counter == 1) {
                    result = a - b;
                    type = "a - b";
                }

                if (counter == 2) {
                    result = a * b;
                    type = "a * b";
                }

                if (counter == 3) {
                    result = a / b;
                    type = "a / b";
                }

                if (counter == 4) {
                    result = (a + b) * (a + b);
                    type = "(a + b)*(a + b)";
                }

                if (counter >= 5) {
                    result = -1;
                    type = "No operation is performed by the server";
                }


                Calculator.ServerStreamResponse response = Calculator.
                        ServerStreamResponse.
                        newBuilder().
                        setA(a).
                        setB(b).
                        setResult(result).
                        setType(type).
                        build();
                responseObserver.onNext(response);
                ++counter;

                if (counter == 10) {
                    responseObserver.onCompleted();
                    timer.cancel();
                }


            }
        }, 1000, 1000);

    }

    @Override
    public StreamObserver<Calculator.ClientStreamRequest> performStream(StreamObserver<Calculator.ClientStreamResponse> responseObserver) {
        return new StreamObserver<Calculator.ClientStreamRequest>() {
            final List<Double> receivedData = new ArrayList<>();
            double result = 0;

            @Override
            public void onNext(Calculator.ClientStreamRequest operationRequest) {

                result += operationRequest.getA();
                receivedData.add(operationRequest.getA());
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();

            }

            @Override
            public void onCompleted() {
                Calculator.ClientStreamResponse.Builder response = Calculator.ClientStreamResponse
                        .newBuilder();
                response.setResult(result);
                response.addAllReceivedData(receivedData);
                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Calculator.BidirectionalStreamRequest> fullStream(StreamObserver<Calculator.BidirectionalStreamResponse> responseObserver) {
        return new StreamObserver<Calculator.BidirectionalStreamRequest>() {
            @Override
            public void onNext(Calculator.BidirectionalStreamRequest operationRequest) {

                Calculator.BidirectionalStreamResponse response = Calculator.
                        BidirectionalStreamResponse.
                        newBuilder().
                        setResult(Math.pow(operationRequest.getA(), 2)).
                        build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

}