# How to Build, Test, and Run the Project

Here, we will discuss how one can build, test, and run the project in Android Studio. To build and run the project, one first needs to create a virtual device
on their machine (or, alternatively, one can connect their Android device to Android Studio by following the steps in this tutorial: https://developer.android.com
/codelabs/basic-android-kotlin-compose-connect-device#0). To utilize a virtual device, one should click on Tools -> Device Manager -> Create Device and then select
a device. (Newer devices, such as a Pixel 5, tend to look better on the screen but have a shorter lifespan, as they utilize more memory, whereas older devices might
not look as neat on the screen but have a (slightly) longer lifestyle.) One should then click on "Next" and then select "API 33." Click "Next" and then "Finish" in 
order to finish instantiating the virtual device. Once the device has been setup following the above steps, one can simply click on the "Run" icon, which is the 
sideways green triangle in the upper-right part of the screen. Doing so will launch the emulator (i.e., the current virtual device) and display the app on the 
virtual device. One can then test particular features of the app by interacting with the app on the emulator; it is, after all, a device that acts as a real
phone.

As of now, there are no format automated tests that are written for our app. This would be an excellent step for future developers to begin with. For the time being,
"testing" the app refers to launching (and interacting with) the app through an emulator.
