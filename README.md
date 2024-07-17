### Security Utils
[![](https://jitpack.io/v/broscr/security-utils.svg)](https://jitpack.io/#broscr/security-utils)

---

### What is Security Utils?

Security Utils is a lightweight Android library that provides easy and efficient methods to determine whether the device is rooted, an emulator, using a proxy, or is debuggable. This library is useful for developers who want to improve the security and performance of their applications by preventing them from running on rooted devices, emulators, devices using a proxy, or debuggable devices.

### Features

Security Utils provides the following features:

- **Root Detection:** This feature allows you to detect whether the device is rooted or not. If the device is rooted, your application can take appropriate actions to enhance security.

- **Emulator Detection:** This feature allows you to detect whether the application is running on an emulator or not. If the application is running on an emulator, it can take appropriate actions to prevent malicious activities.

- **Proxy Detection:** This feature allows you to detect whether the device is using a proxy or not. If the device is using a proxy, your application can take appropriate actions to prevent unauthorized access.

- **Debuggable Detection:** This feature allows you to detect whether the application is debuggable or not. If the application is debuggable, it can take appropriate actions to prevent malicious activities.

### Why should I use this library?

There are several reasons why you might consider using Security Utils:

- **Ease of use:** Security Utils provides easy and lightweight methods to determine device status, making it easy to integrate into your application.

- **Security:** Rooted devices, emulators, devices using a proxy, or debuggable devices can pose a potential security risk for applications. Security Utils enhances security by preventing applications from running on such devices.

- **Compatibility:** Security Utils is compatible with various Android versions and devices, ensuring that your application works across different devices and versions.
  --  Android 5.0 (API level 21) and above.
  --  Java 8 and above.

- **Performance:** Security Utils can improve the performance of your application. For example, if your application does not work on a rooted device or a device using a proxy, it prevents unnecessary code from executing, thus improving performance.


### How to Install?

You can easily install Security Utils by adding the following dependency to your `settings.gradle` file:
```groovy
// dependencyResolutionManagement {
//   repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//   repositories {
//     mavenCentral()
    maven { url 'https://jitpack.io' }
//   }
// }
```
You can easily install Security Utils by adding the following dependency to your app-level `build.gradle` file:
```groovy
implementation 'com.github.broscr:security-utils:Tag'
```
### How to usage ?

Using Security Utils in your application is simple. You can call the following methods to determine device status:

```kotlin
// If the device is rooted, it returns true. 
SecurityUtils.isRooted()

// If the device is an emulator, it returns true. 
SecurityUtils.isEmulator()

// If the device using proxy, it returns true.
SecurityUtils.isUsingProxy()

// If the application is debuggable, it returns true.
SecurityUtils.isDebuggable(this)
```

[](./image.png)

##### LICENSE

SecurityUtils is released under the [MIT License](https://github.com/broscr/security-utils/blob/master/LICENSE). This means that you can use, modify, and distribute the library as long as you comply with the terms of the license.

#### Issues and Contributions

If you encounter any issues while using Security Utils, please report them on the [GitHub issues page](https://github.com/broscr/security-utils/issues). We welcome feedback, bug reports, and feature requests to make this library better. If you want to contribute to the project, please feel free to submit pull requests on GitHub. We appreciate your help in making Security Utils better.