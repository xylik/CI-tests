adb wait-for-device

A=$(adb shell getprop sys.boot_completed | tr -d '\r')
echo $A

while [ "$A" != "1" ]; do
        sleep 2
        A=$(adb shell getprop sys.boot_completed | tr -d '\r')
        echo "Waiting for emulator to start"
done
