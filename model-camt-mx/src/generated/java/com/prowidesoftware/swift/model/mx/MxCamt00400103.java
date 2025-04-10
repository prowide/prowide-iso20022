
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
 * Class for camt.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00400103"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.004.001.03")
public class MxCamt00400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.004.001.03", required = true)
    protected Camt00400103 camt00400103;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountReport8 .class, Accounts3 .class, AmountChoice.class, BalanceStatus1Code.class, BalanceType6Code.class, BalanceType7Code.class, BilateralLimitDetails2 .class, Camt00400103 .class, CashAccountDetails3 .class, CashAccountType2Code.class, CashBalanceDetails4 .class, CashBalanceDetails5 .class, ClearingSystemMemberIdentificationChoice.class, CreditDebitCode.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DatePeriodDetails1 .class, ErrorHandling2 .class, Frequency2Code.class, LimitDetails.class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt00400103 .class, QueryReference.class, SimpleIdentificationInformation.class, StandingOrderDetails3 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.004.001.03";

    public MxCamt00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00400103(final String xml) {
        this();
        MxCamt00400103 tmp = parse(xml);
        camt00400103 = tmp.getCamt00400103();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00400103 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00400103 }
     *     
     */
    public Camt00400103 getCamt00400103() {
        return camt00400103;
    }

    /**
     * Sets the value of the camt00400103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00400103 }
     *     
     */
    public MxCamt00400103 setCamt00400103(Camt00400103 value) {
        this.camt00400103 = value;
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
    public static MxCamt00400103 parse(String xml) {
        return ((MxCamt00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00400103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00400103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00400103) parserImpl.read(MxCamt00400103 .class, xml, _classes));
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
     * Creates an MxCamt00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00400103 message
     * @return
     *     a new instance of MxCamt00400103
     */
    public static final MxCamt00400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00400103 .class);
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
