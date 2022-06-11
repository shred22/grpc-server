package com.grpc.server.controller;

import com.grpc.server.interfaces.GreetResponse;
import com.grpc.server.interfaces.GreeterServiceGrpc;

import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreeterServiceImpl extends GreeterServiceGrpc.GreeterServiceImplBase {

    @Override
    public void greet(com.grpc.server.interfaces.GreetRequest request,
                      io.grpc.stub.StreamObserver<com.grpc.server.interfaces.GreetResponse> responseObserver) {
        GreetResponse reply = GreetResponse.newBuilder()
                .setMessage("Hello ==> " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
