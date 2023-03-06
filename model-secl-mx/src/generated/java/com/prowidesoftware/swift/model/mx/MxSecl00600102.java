
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
 * Class for secl.006.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dfltFndCntrbtnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.006.001.02")
public class MxSecl00600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DfltFndCntrbtnRpt", required = true)
    protected DefaultFundContributionReportV02 dfltFndCntrbtnRpt;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AlternatePartyIdentification4 .class, AmountAndDirection21 .class, ClearingAccountType1Code.class, Collateral3 .class, CollateralType2Code.class, Contribution1 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DefaultFund1 .class, DefaultFundContributionReportV02 .class, DefaultFundReport1 .class, EventFrequency6Code.class, GenericAccountIdentification1 .class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationType6Choice.class, MxSecl00600102 .class, NameAndAddress6 .class, PartyIdentification33Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount31 .class, PartyTextInformation1 .class, PostalAddress2 .class, ReportParameters2 .class, SecuritiesAccount18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:secl.006.001.02";

    public MxSecl00600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00600102(final String xml) {
        this();
        MxSecl00600102 tmp = parse(xml);
        dfltFndCntrbtnRpt = tmp.getDfltFndCntrbtnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dfltFndCntrbtnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultFundContributionReportV02 }
     *     
     */
    public DefaultFundContributionReportV02 getDfltFndCntrbtnRpt() {
        return dfltFndCntrbtnRpt;
    }

    /**
     * Sets the value of the dfltFndCntrbtnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultFundContributionReportV02 }
     *     
     */
    public MxSecl00600102 setDfltFndCntrbtnRpt(DefaultFundContributionReportV02 value) {
        this.dfltFndCntrbtnRpt = value;
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
    public static MxSecl00600102 parse(String xml) {
        return ((MxSecl00600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl00600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl00600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00600102 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00600102) parserImpl.read(MxSecl00600102 .class, xml, _classes));
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
     * Creates an MxSecl00600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00600102 message
     * @return
     *     a new instance of MxSecl00600102
     */
    public final static MxSecl00600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00600102 .class);
    }

}
