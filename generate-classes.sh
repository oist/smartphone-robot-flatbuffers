#!/bin/bash

flatc -b -j -o src/main/java/ episode.fbs
flatc -b -p -o src/main/python/ --force-empty-vectors episode.fbs
