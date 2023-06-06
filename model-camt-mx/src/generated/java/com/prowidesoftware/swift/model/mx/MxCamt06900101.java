
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
 * Class for camt.069.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getStgOrdr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.069.001.01")
public class MxCamt06900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetStgOrdr", required = true)
    protected GetStandingOrderV01 getStgOrdr;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 69;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, DatePeriodDetails.class, DatePeriodDetails2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GetStandingOrderV01 .class, MessageHeader4 .class, MxCamt06900101 .class, PostalAddress6 .class, QueryType2Code.class, RequestType3Choice.class, StandingOrderCriteria1 .class, StandingOrderCriteria1Choice.class, StandingOrderQuery1 .class, StandingOrderQueryType1Code.class, StandingOrderReturnCriteria1 .class, StandingOrderSearchCriteria1 .class, StandingOrderType1Choice.class, StandingOrderType1Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.069.001.01";

    public MxCamt06900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06900101(final String xml) {
        this();
        MxCamt06900101 tmp = parse(xml);
        getStgOrdr = tmp.getGetStgOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link GetStandingOrderV01 }
     *     
     */
    public GetStandingOrderV01 getGetStgOrdr() {
        return getStgOrdr;
    }

    /**
     * Sets the value of the getStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStandingOrderV01 }
     *     
     */
    public MxCamt06900101 setGetStgOrdr(GetStandingOrderV01 value) {
        this.getStgOrdr = value;
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
    public static MxCamt06900101 parse(String xml) {
        return ((MxCamt06900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt06900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt06900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06900101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06900101) parserImpl.read(MxCamt06900101 .class, xml, _classes));
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
     * Creates an MxCamt06900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06900101 message
     * @return
     *     a new instance of MxCamt06900101
     */
    public static final MxCamt06900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06900101 .class);
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
