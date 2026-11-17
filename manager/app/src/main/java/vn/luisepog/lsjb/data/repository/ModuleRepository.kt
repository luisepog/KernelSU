package vn.luisepog.lsjb.data.repository

import vn.luisepog.lsjb.data.model.Module
import vn.luisepog.lsjb.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
