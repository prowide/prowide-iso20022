
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
 * Class for camt.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00300102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.003.001.02")
public class MxCamt00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.003.001.02", required = true)
    protected Camt00300102 camt00300102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountCriteria2 .class, AccountCriteriaDefinition2Choice.class, AccountIdentification1Choice.class, AccountIdentificationSearchCriteriaChoice.class, AccountQueryDefinition2 .class, BalanceCounterparty1Code.class, BalanceDetails2 .class, BalanceType4Code.class, Camt00300102 .class, CashAccountReturnCriteria2 .class, CashAccountSearchCriteria2 .class, CashAccountType2Code.class, CashBalanceReturnCriteria.class, ClearingSystemMemberIdentificationChoice.class, DateAndDateTimeSearchChoice.class, DatePeriodDetails.class, DateSearchChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt00300102 .class, QueryType1Code.class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.003.001.02";

    public MxCamt00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00300102(final String xml) {
        this();
        MxCamt00300102 tmp = parse(xml);
        camt00300102 = tmp.getCamt00300102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00300102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00300102 }
     *     
     */
    public Camt00300102 getCamt00300102() {
        return camt00300102;
    }

    /**
     * Sets the value of the camt00300102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00300102 }
     *     
     */
    public MxCamt00300102 setCamt00300102(Camt00300102 value) {
        this.camt00300102 = value;
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
    public static MxCamt00300102 parse(String xml) {
        return ((MxCamt00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00300102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00300102) parserImpl.read(MxCamt00300102 .class, xml, _classes));
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
     * Creates an MxCamt00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00300102 message
     * @return
     *     a new instance of MxCamt00300102
     */
    public final static MxCamt00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00300102 .class);
    }

}
