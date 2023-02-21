#!/usr/bin/env bash

docker run --rm -it -v $(pwd):/work -w /work -v $(pwd)/_home:/home/pilot -u $(id -u):$(id -g) modicn/openjdk:11-pilot bash