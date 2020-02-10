    package com.picnic.groceries;

    import java.time.Duration;
    import java.util.Objects;

    public class Course {

        private final String name;
        private final Duration duration;
        private int rating;

        public Course(String name, Duration duration, int rating) {
            this.name = name;
            this.duration = duration;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public Duration getDuration() {
            return duration;
        }

        public int getRating() {
            return rating;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Course course = (Course) o;
            return rating == course.rating &&
                    Objects.equals(name, course.name) &&
                    Objects.equals(duration, course.duration);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, duration, rating);
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", duration=" + duration +
                    ", rating=" + rating +
                    '}';
        }
    }
