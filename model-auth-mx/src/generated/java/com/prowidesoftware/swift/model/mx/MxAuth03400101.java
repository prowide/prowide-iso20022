
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
 * Class for auth.034.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcTaxRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.034.001.01")
public class MxAuth03400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvcTaxRpt", required = true)
    protected InvoiceTaxReportV01 invcTaxRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalInformation1 .class, AddressType2Code.class, BinaryFile1 .class, ContactDetails2 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyAndAmount.class, CurrencyReference3 .class, DateAndPlaceOfBirth.class, DocumentGeneralInformation2 .class, DocumentType3Code.class, EarlyPayment1 .class, EarlyPaymentsVAT1 .class, ExchangeRateInformation1 .class, ExchangeRateType1Code.class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader69 .class, InformationType1Choice.class, InformationType1Code.class, InvoiceTaxReportV01 .class, LegalOrganisation1 .class, MessageIdentification1 .class, MxAuth03400101 .class, NamePrefix1Code.class, OrganisationIdentification28 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyIdentification116 .class, PartyIdentification43 .class, PartyIdentification72 .class, Period2 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, SettlementSubTotalCalculatedTax2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxOrganisationIdentification1 .class, TaxParty1 .class, TaxReport1 .class, TaxReportHeader1 .class, TradeSettlement2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.034.001.01";

    public MxAuth03400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03400101(final String xml) {
        this();
        MxAuth03400101 tmp = parse(xml);
        invcTaxRpt = tmp.getInvcTaxRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invcTaxRpt property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTaxReportV01 }
     *     
     */
    public InvoiceTaxReportV01 getInvcTaxRpt() {
        return invcTaxRpt;
    }

    /**
     * Sets the value of the invcTaxRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTaxReportV01 }
     *     
     */
    public MxAuth03400101 setInvcTaxRpt(InvoiceTaxReportV01 value) {
        this.invcTaxRpt = value;
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
    public static MxAuth03400101 parse(String xml) {
        return ((MxAuth03400101) MxReadImpl.parse(MxAuth03400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03400101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03400101) parserImpl.read(MxAuth03400101 .class, xml, _classes));
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
     * Creates an MxAuth03400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03400101 message
     * @return
     *     a new instance of MxAuth03400101
     */
    public final static MxAuth03400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03400101 .class);
    }

}
