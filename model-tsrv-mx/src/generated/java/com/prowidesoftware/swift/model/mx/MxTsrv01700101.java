
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
 * Class for tsrv.017.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dmndWdrwlNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.017.001.01")
public class MxTsrv01700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DmndWdrwlNtfctn", required = true)
    protected DemandWithdrawalNotificationV01 dmndWdrwlNtfctn;
    public static final transient String BUSINESS_PROCESS = "tsrv";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, ContactDetails2 .class, DateAndPlaceOfBirth.class, Demand3 .class, DemandWithdrawalNotificationV01 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTsrv01700101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, Undertaking6 .class, UndertakingDemandWithdrawal1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.017.001.01";

    public MxTsrv01700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv01700101(final String xml) {
        this();
        MxTsrv01700101 tmp = parse(xml);
        dmndWdrwlNtfctn = tmp.getDmndWdrwlNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv01700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dmndWdrwlNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DemandWithdrawalNotificationV01 }
     *     
     */
    public DemandWithdrawalNotificationV01 getDmndWdrwlNtfctn() {
        return dmndWdrwlNtfctn;
    }

    /**
     * Sets the value of the dmndWdrwlNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandWithdrawalNotificationV01 }
     *     
     */
    public MxTsrv01700101 setDmndWdrwlNtfctn(DemandWithdrawalNotificationV01 value) {
        this.dmndWdrwlNtfctn = value;
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
    public static MxTsrv01700101 parse(String xml) {
        return ((MxTsrv01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsrv01700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsrv01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsrv01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv01700101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv01700101) parserImpl.read(MxTsrv01700101 .class, xml, _classes));
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
     * Creates an MxTsrv01700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv01700101 message
     * @return
     *     a new instance of MxTsrv01700101
     */
    public static final MxTsrv01700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsrv01700101 .class);
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
