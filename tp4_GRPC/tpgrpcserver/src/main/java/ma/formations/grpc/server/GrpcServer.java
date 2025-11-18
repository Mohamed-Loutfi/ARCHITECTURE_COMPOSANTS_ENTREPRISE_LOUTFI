package ma.formations.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.formations.grpc.service.CalculatorService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server grpcServer = ServerBuilder.forPort(9999)
                .addService(new CalculatorService()).build();
        grpcServer.start();
        System.out.println("serveur gRPC démarré : http://localhost:9999");
        grpcServer.awaitTermination();
    }
}
