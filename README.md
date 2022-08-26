# Six Kalma App
This is Six kalma app using ViewPager and FragmentPagerAdapter.

## Screenshots
<p float="left">
  <img src="https://user-images.githubusercontent.com/45339238/186822903-bff96f73-a0c9-4d10-a3c6-2f04755f7d37.png" width="300" />
  <img src="https://user-images.githubusercontent.com/45339238/186824717-cfcaea20-3236-4184-8f2f-f06b166ef577.png" width="300" /> 
  <img src="https://user-images.githubusercontent.com/45339238/186824832-b0bbabcb-76d9-4594-bf52-598b138aed93.png" width="300" />
</p>
<p float="left">
  <img src="https://user-images.githubusercontent.com/45339238/186824925-36d1bbec-810a-4f46-b8bc-6fd4085a604d.png" width="300" />
  <img src="https://user-images.githubusercontent.com/45339238/186825011-68a63d6a-45d8-4117-93cd-d9597820571f.png" width="300" /> 
  <img src="https://user-images.githubusercontent.com/45339238/186825026-59d497af-0c96-4302-bb7e-404d9dc7a37c.png" width="300" />
</p>

## Application Features & Implements
- ViewPager
- FragmentPagerAdapter

How to use this repository
--------------
- Fork this repository to your Github account.
- Open Android Studio 3.2.x+ in your local machine.
- We recommend you to use the [Version Control System](https://developer.android.com/studio/intro#version_control_basics)(VCS) in your Android Studio 3.2.x+ IDE to clone the repository directly in your IDE.
- You may have to use the File > Settings > Version Control (VCS) menu option to set up Git settings.
- Refer to this [IntelliJ document](https://www.jetbrains.com/help/idea/version-control-integration.html) for details.
- Working with VCS will make it easy for you to push your updates or switch between branches to your remote repository in Github.

Prerequisites
--------------

- Android Studio 3.2.1 or higher
- compileSdkVersion 32 (For AndroidX dependencies, the min compileSdkVersion version is 31)
- minSdkVersion 21
- Supports up to Android 12
- Gradle 7.2.0

To run app in an Android Virtual Device (AVD), we have used the following configuration:
- Pixel 4 Mobile device with x86 System image
- API level 30
- Android 11

Note - Gradle Updates
---------------

The Android Studio build system depends on Gradle and its plugins. The Gradle and its plugins have to be updated separately of Android Studio.
For the updated version, refer to the following updated files:
~/build.gradle (project) file
~/app/build.graddle(: app) file
~/gradle/wrapper/gradle-wrapper.properties file
You can refer anytime to the latest [Android Gradle plugin release notes](https://developer.android.com/studio/releases/gradle-plugin) for the newest version of plugins.


This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Troubleshoot
---------------
- Gradle version and Android Gradle Plugin version should be compatible. See the table [here](https://developer.android.com/studio/releases/gradle-plugin#updating-gradle)
- Sometimes, if you face unexpected behavior, go to File > Invalidate Caches/Restart. 
- Android Studio - [How to Change Android SDK Path?](https://stackoverflow.com/questions/16581752/android-studio-how-to-change-android-sdk-path/18409923#18409923)  
- In case you face some unexpected errors with the Emulator, it will be beneficial to wipe out the AVD data by going to Tools >> Device Manager >> Select Device >> Wipe out option.


License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.

