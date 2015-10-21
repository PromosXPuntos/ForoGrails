package forograils

class Post {

    String topic
    Date dateCreate
    Date lastUpdate
    Boolean itsAllowed

    static constraints = {
        topic(minSize: 3, maxSize: 50)
    }
}
