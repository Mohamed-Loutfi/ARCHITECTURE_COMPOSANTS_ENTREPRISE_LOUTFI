package ma.formations.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ma.formations.grpc.stubs.Calculator;
import ma.formations.grpc.stubs.CalculatorServiceGrpc;

public class UnaryModelClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.
                forAddress("localhost", 9999).
                usePlaintext().
                build();

        double a = 15;
        double b = 35;

        CalculatorServiceGrpc.CalculatorServiceBlockingStub blockingStub = CalculatorServiceGrpc.newBlockingStub(channel);
        Calculator.UnaryRequest request = Calculator.UnaryRequest.newBuilder()
                .setA(a)
                .setB(b).
                build();
        Calculator.UnaryResponse response = blockingStub.sum(request);
        System.out.println(response);

    }
}
