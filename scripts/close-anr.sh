for i in {1..20}
do
    echo "Waiting for emulator"
    sleep 30 #20*30=600s estimated time for emulator to completely boot up
done
# Send keystroke Arrow Right
sleep 3; adb shell input keyevent 22
# Send keystroke Arrow Right again
sleep 3; adb shell input keyevent 22
# Send keystroke Enter to press a button on the dialog
sleep 3; adb shell input keyevent 66
