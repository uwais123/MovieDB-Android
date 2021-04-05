package com.uwaisalqadri.muvi_app.data.mapper

/**
 * Created by Uwais Alqadri on April 05, 2021
 */
interface BaseMapper<Model, Domain> {
    fun mapToDomain(model: Model): Domain
    fun mapToModel(domain: Domain): Model

    fun mapToListDomain(models: List<Model>): List<Domain> {
        val listDomain = mutableListOf<Domain>()
        models.map { listDomain.add(mapToDomain(it)) }
        return listDomain
    }

    fun mapToListModel(domains: List<Domain>): List<Model> {
        val listModels = mutableListOf<Model>()
        domains.map { listModels.add(mapToModel(it)) }
        return listModels
    }
}