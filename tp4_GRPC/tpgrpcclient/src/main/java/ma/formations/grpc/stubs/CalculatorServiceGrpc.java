package ma.formations.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: calculator.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.UnaryRequest,
      ma.formations.grpc.stubs.Calculator.UnaryResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = ma.formations.grpc.stubs.Calculator.UnaryRequest.class,
      responseType = ma.formations.grpc.stubs.Calculator.UnaryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.UnaryRequest,
      ma.formations.grpc.stubs.Calculator.UnaryResponse> getSumMethod() {
    io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.UnaryRequest, ma.formations.grpc.stubs.Calculator.UnaryResponse> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod = 
              io.grpc.MethodDescriptor.<ma.formations.grpc.stubs.Calculator.UnaryRequest, ma.formations.grpc.stubs.Calculator.UnaryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.UnaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.UnaryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("sum"))
                  .build();
          }
        }
     }
     return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.ServerStreamRequest,
      ma.formations.grpc.stubs.Calculator.ServerStreamResponse> getGetOperationStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOperationStream",
      requestType = ma.formations.grpc.stubs.Calculator.ServerStreamRequest.class,
      responseType = ma.formations.grpc.stubs.Calculator.ServerStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.ServerStreamRequest,
      ma.formations.grpc.stubs.Calculator.ServerStreamResponse> getGetOperationStreamMethod() {
    io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.ServerStreamRequest, ma.formations.grpc.stubs.Calculator.ServerStreamResponse> getGetOperationStreamMethod;
    if ((getGetOperationStreamMethod = CalculatorServiceGrpc.getGetOperationStreamMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGetOperationStreamMethod = CalculatorServiceGrpc.getGetOperationStreamMethod) == null) {
          CalculatorServiceGrpc.getGetOperationStreamMethod = getGetOperationStreamMethod = 
              io.grpc.MethodDescriptor.<ma.formations.grpc.stubs.Calculator.ServerStreamRequest, ma.formations.grpc.stubs.Calculator.ServerStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "getOperationStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.ServerStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.ServerStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("getOperationStream"))
                  .build();
          }
        }
     }
     return getGetOperationStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.ClientStreamRequest,
      ma.formations.grpc.stubs.Calculator.ClientStreamResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = ma.formations.grpc.stubs.Calculator.ClientStreamRequest.class,
      responseType = ma.formations.grpc.stubs.Calculator.ClientStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.ClientStreamRequest,
      ma.formations.grpc.stubs.Calculator.ClientStreamResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.ClientStreamRequest, ma.formations.grpc.stubs.Calculator.ClientStreamResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = CalculatorServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPerformStreamMethod = CalculatorServiceGrpc.getPerformStreamMethod) == null) {
          CalculatorServiceGrpc.getPerformStreamMethod = getPerformStreamMethod = 
              io.grpc.MethodDescriptor.<ma.formations.grpc.stubs.Calculator.ClientStreamRequest, ma.formations.grpc.stubs.Calculator.ClientStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.ClientStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.ClientStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("performStream"))
                  .build();
          }
        }
     }
     return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest,
      ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse> getFullStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullStream",
      requestType = ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest.class,
      responseType = ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest,
      ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse> getFullStreamMethod() {
    io.grpc.MethodDescriptor<ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest, ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse> getFullStreamMethod;
    if ((getFullStreamMethod = CalculatorServiceGrpc.getFullStreamMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFullStreamMethod = CalculatorServiceGrpc.getFullStreamMethod) == null) {
          CalculatorServiceGrpc.getFullStreamMethod = getFullStreamMethod = 
              io.grpc.MethodDescriptor.<ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest, ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CalculatorService", "fullStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("fullStream"))
                  .build();
          }
        }
     }
     return getFullStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    return new CalculatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary Model :
     * </pre>
     */
    public void sum(ma.formations.grpc.stubs.Calculator.UnaryRequest request,
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.UnaryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     * <pre>
     *Server Streaming Model
     * </pre>
     */
    public void getOperationStream(ma.formations.grpc.stubs.Calculator.ServerStreamRequest request,
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ServerStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOperationStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ClientStreamRequest> performStream(
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ClientStreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest> fullStream(
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.formations.grpc.stubs.Calculator.UnaryRequest,
                ma.formations.grpc.stubs.Calculator.UnaryResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getGetOperationStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.formations.grpc.stubs.Calculator.ServerStreamRequest,
                ma.formations.grpc.stubs.Calculator.ServerStreamResponse>(
                  this, METHODID_GET_OPERATION_STREAM)))
          .addMethod(
            getPerformStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.formations.grpc.stubs.Calculator.ClientStreamRequest,
                ma.formations.grpc.stubs.Calculator.ClientStreamResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getFullStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest,
                ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse>(
                  this, METHODID_FULL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractStub<CalculatorServiceStub> {
    private CalculatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model :
     * </pre>
     */
    public void sum(ma.formations.grpc.stubs.Calculator.UnaryRequest request,
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.UnaryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Server Streaming Model
     * </pre>
     */
    public void getOperationStream(ma.formations.grpc.stubs.Calculator.ServerStreamRequest request,
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ServerStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetOperationStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ClientStreamRequest> performStream(
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ClientStreamResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Bidirectional Streaming Model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.BidirectionalStreamRequest> fullStream(
        io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model :
     * </pre>
     */
    public ma.formations.grpc.stubs.Calculator.UnaryResponse sum(ma.formations.grpc.stubs.Calculator.UnaryRequest request) {
      return blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Server Streaming Model
     * </pre>
     */
    public java.util.Iterator<ma.formations.grpc.stubs.Calculator.ServerStreamResponse> getOperationStream(
        ma.formations.grpc.stubs.Calculator.ServerStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetOperationStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary Model :
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.formations.grpc.stubs.Calculator.UnaryResponse> sum(
        ma.formations.grpc.stubs.Calculator.UnaryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_GET_OPERATION_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((ma.formations.grpc.stubs.Calculator.UnaryRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.UnaryResponse>) responseObserver);
          break;
        case METHODID_GET_OPERATION_STREAM:
          serviceImpl.getOperationStream((ma.formations.grpc.stubs.Calculator.ServerStreamRequest) request,
              (io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ServerStreamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.ClientStreamResponse>) responseObserver);
        case METHODID_FULL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullStream(
              (io.grpc.stub.StreamObserver<ma.formations.grpc.stubs.Calculator.BidirectionalStreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.formations.grpc.stubs.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getGetOperationStreamMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getFullStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
