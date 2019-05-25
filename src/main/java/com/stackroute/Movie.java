package com.stackroute;

public class Movie {

        private String m_name;
        private  Actor actor;

    public Movie(String m_name, Actor actor) {
        this.m_name = m_name;
        this.actor = actor;
    }
    public Movie()
    {

    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "m_name='" + m_name + '\'' +
                ", actor=" + actor +
                '}';
    }
}
