package com.shtokal.alla.bucket;

public enum BucketName {

    PROFILE_IMAGE("allashtokal-webbase");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
