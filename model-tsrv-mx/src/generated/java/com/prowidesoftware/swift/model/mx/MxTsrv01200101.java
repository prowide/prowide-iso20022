
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsrv.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "udrtkgTermntnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.012.001.01")
public class MxTsrv01200101
    extends AbstractMX
{

    @XmlElement(name = "UdrtkgTermntnNtfctn", required = true)
    protected UndertakingTerminationNotificationV01 udrtkgTermntnNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsrv";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, ContactDetails2 .class, DateAndPlaceOfBirth.class, Document9 .class, DocumentFormat1Choice.class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTsrv01200101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyAndSignature2 .class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, TerminationReason1Choice.class, TerminationReason1Code.class, Undertaking9 .class, UndertakingDocumentType1Choice.class, UndertakingTermination3 .class, UndertakingTerminationNotice1 .class, UndertakingTerminationNotificationV01 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsrv.012.001.01";

    public MxTsrv01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsrv01200101(final String xml) {
        this();
        MxTsrv01200101 tmp = parse(xml);
        udrtkgTermntnNtfctn = tmp.getUdrtkgTermntnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsrv01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the udrtkgTermntnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingTerminationNotificationV01 }
     *     
     */
    public UndertakingTerminationNotificationV01 getUdrtkgTermntnNtfctn() {
        return udrtkgTermntnNtfctn;
    }

    /**
     * Sets the value of the udrtkgTermntnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingTerminationNotificationV01 }
     *     
     */
    public MxTsrv01200101 setUdrtkgTermntnNtfctn(UndertakingTerminationNotificationV01 value) {
        this.udrtkgTermntnNtfctn = value;
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
    public static MxTsrv01200101 parse(String xml) {
        return ((MxTsrv01200101) MxReadImpl.parse(MxTsrv01200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsrv01200101 parse(String xml, MxRead parserImpl) {
        return ((MxTsrv01200101) parserImpl.read(MxTsrv01200101 .class, xml, _classes));
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
     * Creates an MxTsrv01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsrv01200101 message
     * @return
     *     a new instance of MxTsrv01200101
     */
    public final static MxTsrv01200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsrv01200101 .class);
    }

}
