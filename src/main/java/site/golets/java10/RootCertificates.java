package site.golets.java10;

public class RootCertificates {

    /**
     * The cacerts keystore, which was initially empty so far, is intended to contain a set of root certificates that
     * can be used to establish trust in the certificate chains used by various security protocols.
     *
     * As a result, critical security components such as TLS didn't work by default under OpenJDK builds.
     *
     * With Java 10, Oracle has open-sourced the root certificates in Oracle's Java SE Root CA program in order
     * to make OpenJDK builds more attractive to developers and to reduce the
     * differences between those builds and Oracle JDK builds.
     *
     * */

}
