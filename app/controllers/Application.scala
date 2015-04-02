package controllers

import play.api._
import play.api.mvc._

import scala.collection.mutable.ListBuffer
import scala.util.Random

object Application extends Controller {

  val randomMessages = Seq(
    "Pablo is Xebia's prophet",
    "Welcome to Devoxx",
    "Beware the chaos monkey"
  )

  val listOfString = ListBuffer("Hello Devoxx")

  def index = Action {
    Ok(views.html.index(listOfString))
  }

  def add = Action {
    listOfString += Random.shuffle(randomMessages).head
    Redirect("/")
  }

}