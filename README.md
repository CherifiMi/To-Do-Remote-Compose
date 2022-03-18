<h1 align="center">Remote Task Manager</h1>

<p align="center">  
 This app is a task manager that saves data in a remote costume made API that's connected to a MongoDB cluster. Made in Android Studio with Jetpack Compose, ViewModel, RetroFit, dagger hilt, Compose Navigation, and Material Design based on MVVM architecture.
  
  I have made a similar app to this one that saves that data localy in a ROOM DATABASE instead of remotely [HERE](https://github.com/CherifiMi/To-Do-Api)
</p>
</br>

<img width="1279" alt="todo" src="https://user-images.githubusercontent.com/98290339/159067160-74bb89fb-eb7d-4d40-818c-6522e936c8fa.png">



#### Ui Made in [Figma](https://www.figma.com/file/mtCF10n9wphsv1JdKG00uQ/Ux-and-shi?node-id=334%3A333)


## Tech stack & Open-source libraries

- Minimum SDK level 21
- [Hilt](https://dagger.dev/hilt/) for dependency injection.
- Architecture
    - MVVM Architecture (View - ViewBinding - ViewModel - Model)
    - Repository Pattern (Local/Remote)
- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation)
- [LazyColumns](https://developer.android.com/jetpack/compose/lists)
- [Compose Animations](https://developer.android.com/jetpack/compose/animation)
- [Gestures Detection](https://developer.android.com/jetpack/compose/gestures)
- [Retrofit](https://github.com/square/retrofit) 




## What I learned
- creating custem views in jetpack
- navigation in jetpack 
- using the draw behind function
- posting into a costem API



## Architecture
Foody is based on the MVVM architecture and the Repository pattern.
![image](https://user-images.githubusercontent.com/98290339/152096381-2a8898d3-c351-4032-979d-ebc836e46332.png)

## Ktor API

[This API](https://github.com/CherifiMi/KMongo-Api) was one of my first test on writing a ktor api, making a MongoDB cluster and connecting all of them
