
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for admi.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dlvryStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:admi.014.001.02")
public class MxAdmi01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DlvryStsNtfctn", required = true)
    protected DeliveryStatusNotificationV02 dlvryStsNtfctn;
    public final static transient String BUSINESS_PROCESS = "admi";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessApplicationHeader3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, DeliveryStatus1Code.class, DeliveryStatusNotificationV02 .class, ErrorSeverity1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, MxAdmi01400102 .class, OrganisationIdentification26 .class, Party1 .class, Party29Choice.class, PartyIdentification94 .class, PostalAddress6 .class, RelatedReference1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalError1 .class, TechnicalError1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:admi.014.001.02";

    public MxAdmi01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi01400102(final String xml) {
        this();
        MxAdmi01400102 tmp = parse(xml);
        dlvryStsNtfctn = tmp.getDlvryStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dlvryStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatusNotificationV02 }
     *     
     */
    public DeliveryStatusNotificationV02 getDlvryStsNtfctn() {
        return dlvryStsNtfctn;
    }

    /**
     * Sets the value of the dlvryStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatusNotificationV02 }
     *     
     */
    public MxAdmi01400102 setDlvryStsNtfctn(DeliveryStatusNotificationV02 value) {
        this.dlvryStsNtfctn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAdmi01400102 parse(String xml) {
        return ((MxAdmi01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAdmi01400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAdmi01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi01400102 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi01400102) parserImpl.read(MxAdmi01400102 .class, xml, _classes));
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
     * Creates an MxAdmi01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi01400102 message
     * @return
     *     a new instance of MxAdmi01400102
     */
    public final static MxAdmi01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi01400102 .class);
    }

}
