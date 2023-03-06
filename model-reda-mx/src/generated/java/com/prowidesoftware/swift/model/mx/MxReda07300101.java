
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
 * Class for reda.073.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqToPayDbtrActvtnStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.073.001.01")
public class MxReda07300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqToPayDbtrActvtnStsRpt", required = true)
    protected RequestToPayDebtorActivationStatusReportV01 reqToPayDbtrActvtnStsRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 73;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActivationHeader2 .class, ActivationStatus2 .class, AddressType2Code.class, AddressType3Choice.class, Contact4 .class, ContractReference1 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DebtorActivation3 .class, DebtorActivationStatusReason1Choice.class, DebtorActivationStatusReason2 .class, DocumentFormat2Choice.class, DocumentType1Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxReda07300101 .class, NamePrefix2Code.class, OrganisationIdentification37 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalActivation2Choice.class, OriginalBusinessInstruction1 .class, OtherContact1 .class, Party49Choice.class, PersonIdentification17 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, RTPPartyIdentification1 .class, RequestToPayDebtorActivationStatusReportV01 .class, ServiceRequestStatus1Code.class, ServiceStatus1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.073.001.01";

    public MxReda07300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda07300101(final String xml) {
        this();
        MxReda07300101 tmp = parse(xml);
        reqToPayDbtrActvtnStsRpt = tmp.getReqToPayDbtrActvtnStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda07300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqToPayDbtrActvtnStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestToPayDebtorActivationStatusReportV01 }
     *     
     */
    public RequestToPayDebtorActivationStatusReportV01 getReqToPayDbtrActvtnStsRpt() {
        return reqToPayDbtrActvtnStsRpt;
    }

    /**
     * Sets the value of the reqToPayDbtrActvtnStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestToPayDebtorActivationStatusReportV01 }
     *     
     */
    public MxReda07300101 setReqToPayDbtrActvtnStsRpt(RequestToPayDebtorActivationStatusReportV01 value) {
        this.reqToPayDbtrActvtnStsRpt = value;
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
    public static MxReda07300101 parse(String xml) {
        return ((MxReda07300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda07300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda07300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda07300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda07300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda07300101 parse(String xml, MxRead parserImpl) {
        return ((MxReda07300101) parserImpl.read(MxReda07300101 .class, xml, _classes));
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
     * Creates an MxReda07300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda07300101 message
     * @return
     *     a new instance of MxReda07300101
     */
    public final static MxReda07300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda07300101 .class);
    }

}
