package di

import articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)