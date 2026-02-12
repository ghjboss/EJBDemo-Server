# Use the public WildFly image which supports Jakarta EE 10 and Java 17
FROM quay.io/wildfly/wildfly-s2i-jdk17:latest

# S2I requirement: Copy source to /tmp/src
COPY . /tmp/src

# Run the build script provided by the WildFly image
# This handles Maven compilation and server provisioning
RUN /usr/local/s2i/assemble

# Set the default command to run the server
CMD /usr/local/s2i/run