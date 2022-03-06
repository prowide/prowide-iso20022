
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for secl.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dfltFndCntrbtnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:secl.006.001.01")
public class MxSecl00600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DfltFndCntrbtnRpt", required = true)
    protected DefaultFundContributionReportV01 dfltFndCntrbtnRpt;
    public final static transient String BUSINESS_PROCESS = "secl";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AlternatePartyIdentification4 .class, AmountAndDirection21 .class, ClearingAccountType1Code.class, Collateral3 .class, CollateralType2Code.class, Contribution1 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DefaultFund1 .class, DefaultFundContributionReportV01 .class, DocumentIdentification11 .class, EventFrequency6Code.class, GenericAccountIdentification1 .class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationType6Choice.class, MxSecl00600101 .class, NameAndAddress6 .class, PartyIdentification33Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount31 .class, PartyTextInformation1 .class, PostalAddress2 .class, ReportParameters2 .class, SecuritiesAccount18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:secl.006.001.01";

    public MxSecl00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00600101(final String xml) {
        this();
        MxSecl00600101 tmp = parse(xml);
        dfltFndCntrbtnRpt = tmp.getDfltFndCntrbtnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dfltFndCntrbtnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultFundContributionReportV01 }
     *     
     */
    public DefaultFundContributionReportV01 getDfltFndCntrbtnRpt() {
        return dfltFndCntrbtnRpt;
    }

    /**
     * Sets the value of the dfltFndCntrbtnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultFundContributionReportV01 }
     *     
     */
    public MxSecl00600101 setDfltFndCntrbtnRpt(DefaultFundContributionReportV01 value) {
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
    public static MxSecl00600101 parse(String xml) {
        return ((MxSecl00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl00600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl00600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00600101 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00600101) parserImpl.read(MxSecl00600101 .class, xml, _classes));
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
     * Creates an MxSecl00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00600101 message
     * @return
     *     a new instance of MxSecl00600101
     */
    public final static MxSecl00600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00600101 .class);
    }

}
