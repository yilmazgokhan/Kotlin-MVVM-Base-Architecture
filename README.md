# MVVM Architecture with Kotlin

![platform](https://img.shields.io/badge/Android-blue)
![platform](https://img.shields.io/badge/MVVM-blue)
![Kotlin](https://img.shields.io/badge/Kotlin-blue)
![compileSdkVersion](https://img.shields.io/badge/compileSdkVersion-30-yellow)
![buildToolsVersion](https://img.shields.io/badge/buildToolsVersion-30.0.3-yellow)
![minSdkVersion](https://img.shields.io/badge/minSdkVersion-28-yellow)

<img src="/screenshots/kotlin.png">

> I recommend this structure for basic projects that are not extensive.


## Introduction

This project is intent to provide a template with basic MVVM architecture framework.

<b>Advantages:</b>

- Simple and easy to read
- The project has hilt integration
- The project has Navigation Component integration


## Project Structure

- base: Base class for View and ViewModel instances.
- di: The directory will contain the classes responsible for dependency injection.
- ui: View classes along with their corresponding ViewModel in presentation.
- util: Utility classes.


## MVVM Design Pattern

The main players in the MVVM pattern are:

- View: informs the ViewModel about the user’s actions

- ViewModel: exposes streams of data relevant to the View

- Model: abstracts the data source. The ViewModel works with the DataModel to get and save the data

The MVVM pattern supports two-way data binding between the View and ViewModel and there is a many-to-one relationship between View and ViewModel.

<img src="/screenshots/mvvm.png">


## Libraries

- [Kotlin](https://kotlinlang.org/)
- [Fragment KTX](https://developer.android.com/kotlin/ktx)
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture/index.html)
- [Coroutines](https://developer.android.com/kotlin/coroutines)
- [Dagger 2 (2.28)](https://github.com/google/dagger)
- [Coil](https://coil-kt.github.io/coil/)
- [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started)
- [Android Util](https://github.com/Blankj/AndroidUtilCode)


### Contributing to Project

- All contributions are welcome! Please fork this repository and contribute back using pull requests.


> Don't forget to star ⭐ the repo it motivates me to share more open source