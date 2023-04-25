
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsrv.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "udrtkgNonXtnsnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.011.001.01")
public class MxTsrv01100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UdrtkgNonXtnsnNtfctn", required = true)
    protected UndertakingNonExtensionNotificationV01 udrtkgNonXtnsnNtfctn;
    public static final transient String BUSINESS_PROCESS = "tsrv";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, ContactDetails2 .class, DateAndPlaceOfBirth.class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTsrv01100101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, Undertaking7 .class, UndertakingNonExtensionNotificationV01 .class, UndertakingNonExtensionStatusAdvice1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.011.001.01";

    public MxTsrv01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv01100101(final String xml) {
        this();
        MxTsrv01100101 tmp = parse(xml);
        udrtkgNonXtnsnNtfctn = tmp.getUdrtkgNonXtnsnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the udrtkgNonXtnsnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingNonExtensionNotificationV01 }
     *     
     */
    public UndertakingNonExtensionNotificationV01 getUdrtkgNonXtnsnNtfctn() {
        return udrtkgNonXtnsnNtfctn;
    }

    /**
     * Sets the value of the udrtkgNonXtnsnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingNonExtensionNotificationV01 }
     *     
     */
    public MxTsrv01100101 setUdrtkgNonXtnsnNtfctn(UndertakingNonExtensionNotificationV01 value) {
        this.udrtkgNonXtnsnNtfctn = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxTsrv01100101 parse(String xml) {
        return ((MxTsrv01100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv01100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsrv01100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsrv01100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv01100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv01100101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv01100101) parserImpl.read(MxTsrv01100101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxTsrv01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv01100101 message
     * @return
     *     a new instance of MxTsrv01100101
     */
    public static final MxTsrv01100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsrv01100101 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
