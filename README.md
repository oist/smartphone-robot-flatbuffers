This repo hosts the [flatbuffer](https://flatbuffers.dev/) class generation for the [Android](https://github.com/oist/smartphone-robot-android)-2-[Python](https://github.com/oist/smartphone-robot-python-server) API for the OIST smartphone robot project.

In short, it automatically generates classes in both Java and Python that can be used to serialize and deserialize messages between the Android and Python servers without having to write the serialization and deserialization code manually.

## Installation
1. Install the package `pip install smartphone_robot_flatbuffers`

## Developing
1. Remove existing pip installation if present `pip uninstall smartphone_robot_flatbuffers`
2. Install the package in editable mode `pip install -e .` (from the root of this repo else replace `.` with the path to the root of this repo)
3. Update episode.fbs with the new message types
4. commit changes and make PR or push
5. Add a versioned tag `git tag v0.1.0` and push `git push --tags` to trigger the github actions to generate the classes and upload to pypi.
