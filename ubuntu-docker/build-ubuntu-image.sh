#!/usr/bin/env sh
ABS_DOCKER_DIR=$(dirname $(readlink -f $0))
DISTRO="ubuntu"
VERSION="18.04"
IMAGE="apss/$DISTRO-builder:v$VERSION"

# build docker image with the required username
docker build -t $IMAGE -f $ABS_DOCKER_DIR/Dockerfile $ABS_DOCKER_DIR
