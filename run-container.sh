#!/usr/bin/env bash

docker run --rm -it -v $(pwd):/work -w /work -v $(pwd)/_home:/home/pilot -u 1000:1000 modicn/openjdk:8-bullseye-user