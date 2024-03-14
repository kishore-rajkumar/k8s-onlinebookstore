#!/bin/bash

# Call the snapshot-docker-image.sh script
./scripts/build/snapshot-docker-image.sh

# Call the push-to-dockerhub.sh script
./scripts/build/push-to-dockerhub.sh