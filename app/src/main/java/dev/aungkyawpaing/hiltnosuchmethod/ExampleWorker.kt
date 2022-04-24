package dev.aungkyawpaing.hiltnosuchmethod

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class ExampleWorker @AssistedInject constructor(
  @Assisted appContext: Context,
  @Assisted workerParams: WorkerParameters,
  workerDependency: WorkerDependency
) : CoroutineWorker(appContext, workerParams) {

  override suspend fun doWork(): Result {
    TODO("Not yet implemented")
  }

}
