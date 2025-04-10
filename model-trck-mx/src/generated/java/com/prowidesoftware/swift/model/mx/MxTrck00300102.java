
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
 * Class for trck.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trckrAlrtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trck.003.001.02")
public class MxTrck00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrckrAlrtNtfctn", required = true)
    protected TrackerAlertNotificationV02 trckrAlrtNtfctn;
    public static final transient String BUSINESS_PROCESS = "trck";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification21 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxTrck00300102 .class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessInstruction1 .class, OriginalBusinessInstruction4 .class, PaymentIdentification10 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, ServiceLevel8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TrackerAlertNotificationStatus1 .class, TrackerAlertNotificationV02 .class, TrackerAlertStatus1Choice.class, TrackerAlertStatusReason1Choice.class, TrackerHeader5 .class, TrackerParty2Choice.class, TrackerPartyIdentification2 .class, TrackerPaymentTransaction7 .class, TrackerStatus2 .class, TrackerStatusAndTransaction7 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:trck.003.001.02";

    public MxTrck00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrck00300102(final String xml) {
        this();
        MxTrck00300102 tmp = parse(xml);
        trckrAlrtNtfctn = tmp.getTrckrAlrtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrck00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trckrAlrtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerAlertNotificationV02 }
     *     
     */
    public TrackerAlertNotificationV02 getTrckrAlrtNtfctn() {
        return trckrAlrtNtfctn;
    }

    /**
     * Sets the value of the trckrAlrtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerAlertNotificationV02 }
     *     
     */
    public MxTrck00300102 setTrckrAlrtNtfctn(TrackerAlertNotificationV02 value) {
        this.trckrAlrtNtfctn = value;
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
    public static MxTrck00300102 parse(String xml) {
        return ((MxTrck00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrck00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrck00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTrck00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrck00300102 parse(String xml, MxRead parserImpl) {
        return ((MxTrck00300102) parserImpl.read(MxTrck00300102 .class, xml, _classes));
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
     * Creates an MxTrck00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrck00300102 message
     * @return
     *     a new instance of MxTrck00300102
     */
    public static final MxTrck00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrck00300102 .class);
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
