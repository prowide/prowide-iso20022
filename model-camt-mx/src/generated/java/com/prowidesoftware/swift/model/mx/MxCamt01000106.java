
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
 * Class for camt.010.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrLmt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.010.001.06")
public class MxCamt01000106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrLmt", required = true)
    protected ReturnLimitV06 rtrLmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, Limit4 .class, LimitIdentification1 .class, LimitOrError2Choice.class, LimitReport5 .class, LimitReportOrError2Choice.class, LimitStatus1Code.class, LimitType1Choice.class, LimitType3Code.class, Limits5 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader3 .class, MxCamt01000106 .class, OriginalBusinessQuery1 .class, PostalAddress6 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ReturnLimitV06 .class, SystemIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.010.001.06";

    public MxCamt01000106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01000106(final String xml) {
        this();
        MxCamt01000106 tmp = parse(xml);
        rtrLmt = tmp.getRtrLmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01000106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLimitV06 }
     *     
     */
    public ReturnLimitV06 getRtrLmt() {
        return rtrLmt;
    }

    /**
     * Sets the value of the rtrLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLimitV06 }
     *     
     */
    public MxCamt01000106 setRtrLmt(ReturnLimitV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt01000106 parse(String xml) {
        return ((MxCamt01000106) MxReadImpl.parse(MxCamt01000106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01000106 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01000106) parserImpl.read(MxCamt01000106 .class, xml, _classes));
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
     * Creates an MxCamt01000106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01000106 message
     * @return
     *     a new instance of MxCamt01000106
     */
    public final static MxCamt01000106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01000106 .class);
    }

}
