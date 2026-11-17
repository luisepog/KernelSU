package vn.luisepog.lsjb.data.repository

import vn.luisepog.lsjb.data.model.AppInfo

interface SuperUserRepository {
    suspend fun getAppList(): Result<Pair<List<AppInfo>, List<Int>>>
    suspend fun refreshProfiles(currentApps: List<AppInfo>): Result<List<AppInfo>>
}
