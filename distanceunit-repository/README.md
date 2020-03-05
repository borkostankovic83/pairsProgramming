# DistanceUnit-Repository
## Build and run project
At base project directory, run the following command at command prompt
```
./gradlew cleean build bootRun
```
##URL for distance unit conversion

Request url
```aidl
http://localhost:8001/api/convert/{from-unit}/to/{to-unit}?unit={from-unit-number}
```
Sample request url
```aidl
http://localhost:8001/api/convert/centimeters/to/meters?unit=72
```
Sample response
```aidl
0.72
```
Valid distance unit for `from-unit` and `to-unit` path parameters, case-insensitive
```aidl
enum DistanceUnit {
    Millimeters("millimeters"),
    Centimeters("centimeters"),
    Meters("meters"),
    Kilometers("kilometers"),
    Inches("inches"),
    Feet("feet"),
    Yards("yards"),
    Miles("miles");
}
```