#!/bin/bash
for i in {1..10}
do
    echo "Waiting for emulator"
    sleep 30 #20*30=600s estimated time for emulator to completely boot up
done
echo "Waiting finished"
