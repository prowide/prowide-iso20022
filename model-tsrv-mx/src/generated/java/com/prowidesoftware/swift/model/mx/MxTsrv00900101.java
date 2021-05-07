
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsrv.009.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "udrtkgAmdmntRspnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.009.001.01")
public class MxTsrv00900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UdrtkgAmdmntRspnNtfctn", required = true)
    protected UndertakingAmendmentResponseNotificationV01 udrtkgAmdmntRspnNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsrv";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, Amendment7 .class, Amendment8 .class, Amendment9 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTsrv00900101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, UndertakingAmendmentResponseMessage1 .class, UndertakingAmendmentResponseNotificationV01 .class, UndertakingStatus2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.009.001.01";

    public MxTsrv00900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv00900101(final String xml) {
        this();
        MxTsrv00900101 tmp = parse(xml);
        udrtkgAmdmntRspnNtfctn = tmp.getUdrtkgAmdmntRspnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv00900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the udrtkgAmdmntRspnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmendmentResponseNotificationV01 }
     *     
     */
    public UndertakingAmendmentResponseNotificationV01 getUdrtkgAmdmntRspnNtfctn() {
        return udrtkgAmdmntRspnNtfctn;
    }

    /**
     * Sets the value of the udrtkgAmdmntRspnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmendmentResponseNotificationV01 }
     *     
     */
    public MxTsrv00900101 setUdrtkgAmdmntRspnNtfctn(UndertakingAmendmentResponseNotificationV01 value) {
        this.udrtkgAmdmntRspnNtfctn = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxTsrv00900101 parse(String xml) {
        return ((MxTsrv00900101) MxReadImpl.parse(MxTsrv00900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv00900101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv00900101) parserImpl.read(MxTsrv00900101 .class, xml, _classes));
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
     * Creates an MxTsrv00900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv00900101 message
     * @return
     *     a new instance of MxTsrv00900101
     */
    public final static MxTsrv00900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsrv00900101 .class);
    }

}
