
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
 * Class for camt.010.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrLmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.010.001.05")
public class MxCamt01000105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrLmt", required = true)
    protected ReturnLimitV05 rtrLmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, Limit4 .class, LimitIdentification1 .class, LimitOrError1Choice.class, LimitReport4 .class, LimitReportOrError1Choice.class, LimitStatus1Code.class, LimitType1Choice.class, LimitType3Code.class, Limits4 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader3 .class, MxCamt01000105 .class, OriginalBusinessQuery1 .class, PostalAddress6 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ReturnLimitV05 .class, SystemIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.010.001.05";

    public MxCamt01000105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01000105(final String xml) {
        this();
        MxCamt01000105 tmp = parse(xml);
        rtrLmt = tmp.getRtrLmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01000105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLimitV05 }
     *     
     */
    public ReturnLimitV05 getRtrLmt() {
        return rtrLmt;
    }

    /**
     * Sets the value of the rtrLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLimitV05 }
     *     
     */
    public MxCamt01000105 setRtrLmt(ReturnLimitV05 value) {
        this.rtrLmt = value;
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
    public static MxCamt01000105 parse(String xml) {
        return ((MxCamt01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01000105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01000105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01000105) parserImpl.read(MxCamt01000105 .class, xml, _classes));
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
     * Creates an MxCamt01000105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01000105 message
     * @return
     *     a new instance of MxCamt01000105
     */
    public final static MxCamt01000105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01000105 .class);
    }

}
