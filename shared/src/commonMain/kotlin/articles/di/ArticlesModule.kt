package articles.di

import articles.ArticlesService
import articles.ArticlesUseCase
import articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {
    single<ArticlesService> {
        ArticlesService(get())
    }
    single<ArticlesUseCase> {
        ArticlesUseCase(get())
    }
    single<ArticlesViewModel> {
        ArticlesViewModel(get())
    }
}