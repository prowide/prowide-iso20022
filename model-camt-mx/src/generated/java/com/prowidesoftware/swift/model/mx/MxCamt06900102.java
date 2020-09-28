
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
 * Class for camt.069.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getStgOrdr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.069.001.02")
public class MxCamt06900102
    extends AbstractMX
{

    @XmlElement(name = "GetStgOrdr", required = true)
    protected GetStandingOrderV02 getStgOrdr;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 69;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, DatePeriod2 .class, DatePeriod2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GetStandingOrderV02 .class, MessageHeader4 .class, MxCamt06900102 .class, PostalAddress6 .class, QueryType2Code.class, RequestType3Choice.class, StandingOrderCriteria2 .class, StandingOrderCriteria2Choice.class, StandingOrderQuery2 .class, StandingOrderQueryType1Code.class, StandingOrderReturnCriteria1 .class, StandingOrderSearchCriteria2 .class, StandingOrderType1Choice.class, StandingOrderType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.069.001.02";

    public MxCamt06900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06900102(final String xml) {
        this();
        MxCamt06900102 tmp = parse(xml);
        getStgOrdr = tmp.getGetStgOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link GetStandingOrderV02 }
     *     
     */
    public GetStandingOrderV02 getGetStgOrdr() {
        return getStgOrdr;
    }

    /**
     * Sets the value of the getStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStandingOrderV02 }
     *     
     */
    public MxCamt06900102 setGetStgOrdr(GetStandingOrderV02 value) {
        this.getStgOrdr = value;
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
    public static MxCamt06900102 parse(String xml) {
        return ((MxCamt06900102) MxReadImpl.parse(MxCamt06900102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06900102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06900102) parserImpl.read(MxCamt06900102 .class, xml, _classes));
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
     * Creates an MxCamt06900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06900102 message
     * @return
     *     a new instance of MxCamt06900102
     */
    public final static MxCamt06900102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt06900102 .class);
    }

}
