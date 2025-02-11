
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
 * Class for camt.050.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "lqdtyCdtTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.050.001.05")
public class MxCamt05000105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "LqdtyCdtTrf", required = true)
    protected LiquidityCreditTransferV05 lqdtyCdtTrf;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 50;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, LiquidityCreditTransfer2 .class, LiquidityCreditTransferV05 .class, MessageHeader1 .class, MxCamt05000105 .class, PaymentIdentification8 .class, PostalAddress24 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.050.001.05";

    public MxCamt05000105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05000105(final String xml) {
        this();
        MxCamt05000105 tmp = parse(xml);
        lqdtyCdtTrf = tmp.getLqdtyCdtTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05000105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the lqdtyCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityCreditTransferV05 }
     *     
     */
    public LiquidityCreditTransferV05 getLqdtyCdtTrf() {
        return lqdtyCdtTrf;
    }

    /**
     * Sets the value of the lqdtyCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityCreditTransferV05 }
     *     
     */
    public MxCamt05000105 setLqdtyCdtTrf(LiquidityCreditTransferV05 value) {
        this.lqdtyCdtTrf = value;
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
    public static MxCamt05000105 parse(String xml) {
        return ((MxCamt05000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05000105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05000105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05000105) parserImpl.read(MxCamt05000105 .class, xml, _classes));
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
     * Creates an MxCamt05000105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05000105 message
     * @return
     *     a new instance of MxCamt05000105
     */
    public static final MxCamt05000105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05000105 .class);
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
