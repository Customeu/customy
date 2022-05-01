package models.db

import javax.inject.Inject
import play.api.db.Database

import scala.concurrent.Future

class MainDatabase @Inject() (db: Database, implicit val databaseExecutionContext: DatabaseExecutionContext){
 
}