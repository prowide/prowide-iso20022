
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
 * Class for sese.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sese00600101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.006.001.01")
public class MxSese00600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "sese.006.001.01", required = true)
    protected Sese00600101 sese00600101;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account1 .class, AccountIdentification1 .class, AdditionalReference2 .class, AlternateSecurityIdentification1 .class, DateAndDateTimeChoice.class, DateFormat1Choice.class, DeliverInformation1 .class, DeliveringPartiesAndAccount1 .class, DeliveryParameters2 .class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument3 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IncomePreference1Code.class, Intermediary1 .class, InvestmentAccount10 .class, InvestmentAccount11 .class, LongPostalAddress1Choice.class, MxSese00600101 .class, NameAndAddress1 .class, NameAndAddress2 .class, PartyIdentification1Choice.class, PartyIdentificationAndAccount2 .class, SecurityIdentification1Choice.class, Sese00600101 .class, SettlementDate1Code.class, SimpleIdentificationInformation.class, StructuredLongPostalAddress1 .class, Transfer3 .class, TransferIn2 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.006.001.01";

    public MxSese00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00600101(final String xml) {
        this();
        MxSese00600101 tmp = parse(xml);
        sese00600101 = tmp.getSese00600101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sese00600101 property.
     * 
     * @return
     *     possible object is
     *     {@link Sese00600101 }
     *     
     */
    public Sese00600101 getSese00600101() {
        return sese00600101;
    }

    /**
     * Sets the value of the sese00600101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sese00600101 }
     *     
     */
    public MxSese00600101 setSese00600101(Sese00600101 value) {
        this.sese00600101 = value;
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
    public static MxSese00600101 parse(String xml) {
        return ((MxSese00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00600101 parse(String xml, MxRead parserImpl) {
        return ((MxSese00600101) parserImpl.read(MxSese00600101 .class, xml, _classes));
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
     * Creates an MxSese00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00600101 message
     * @return
     *     a new instance of MxSese00600101
     */
    public static final MxSese00600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00600101 .class);
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
