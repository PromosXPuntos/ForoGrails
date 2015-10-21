package forograils

class Post {

    String topic
    Date dateCreate
    Date lastUpdate
    Boolean itsAllowed

    static constraints = {
        topic(minSize: 3, maxSize: 50)
        dateCreate(validator: {return it > new Date()})
        lastUpdate(validator: {return it > new Date()})
    }
}
