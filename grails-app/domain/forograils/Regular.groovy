package forograils

class Regular extends User {

    Integer postViews
    Integer strikesNumber
    Integer starsNumber

    static hasMany = [post:Post]

    static constraints = {
        postViews(min: 0)
        strikesNumber(range: 0..3)
        starsNumber(range: 0..5)
    }
}
