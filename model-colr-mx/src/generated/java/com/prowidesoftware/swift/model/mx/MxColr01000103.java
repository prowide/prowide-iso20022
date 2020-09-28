
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.010.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collSbstitnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.010.001.03")
public class MxColr01000103
    extends AbstractMX
{

    @XmlElement(name = "CollSbstitnReq", required = true)
    protected CollateralSubstitutionRequestV03 collSbstitnReq;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification26 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, AlternatePartyIdentification5 .class, CashCollateral3 .class, CashCollateral5 .class, CollateralAccount1 .class, CollateralAccountIdentificationType1Choice.class, CollateralAccountType1Code.class, CollateralOwnership1 .class, CollateralSubstitution2 .class, CollateralSubstitution3 .class, CollateralSubstitutionRequestV03 .class, CollateralSubstitutionSequence1Code.class, CollateralSubstitutionType1Code.class, ContactIdentification2 .class, DateAndDateTimeChoice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DeliveringPartiesAndAccount10 .class, DepositType1Code.class, ExposureType5Code.class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericIdentification29 .class, GenericIdentification30 .class, GenericIdentification40 .class, GenericIdentification58 .class, IdentificationSource3Choice.class, IdentificationType40Choice.class, MxColr01000103 .class, NameAndAddress13 .class, NameAndAddress5 .class, NameAndAddress6 .class, NamePrefix1Code.class, Obligation3 .class, OtherCollateral2 .class, OtherCollateral4 .class, OtherIdentification1 .class, OtherTypeOfCollateral2 .class, PartyIdentification32Choice.class, PartyIdentification33Choice.class, PartyIdentification34Choice.class, PartyIdentificationAndAccount102 .class, PartyIdentificationAndAccount77 .class, PartyTextInformation1 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress8 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, ReceivingPartiesAndAccount10 .class, Reference17 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat7Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText1 .class, SecuritiesAccount19 .class, SecuritiesCollateral3 .class, SecuritiesCollateral4 .class, SecurityIdentification14 .class, SettlementDetails88 .class, SettlementParties3Choice.class, SimpleIdentificationInformation4 .class, SubAccount4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TypeOfIdentification2Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.010.001.03";

    public MxColr01000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01000103(final String xml) {
        this();
        MxColr01000103 tmp = parse(xml);
        collSbstitnReq = tmp.getCollSbstitnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collSbstitnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionRequestV03 }
     *     
     */
    public CollateralSubstitutionRequestV03 getCollSbstitnReq() {
        return collSbstitnReq;
    }

    /**
     * Sets the value of the collSbstitnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionRequestV03 }
     *     
     */
    public MxColr01000103 setCollSbstitnReq(CollateralSubstitutionRequestV03 value) {
        this.collSbstitnReq = value;
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
    public static MxColr01000103 parse(String xml) {
        return ((MxColr01000103) MxReadImpl.parse(MxColr01000103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01000103 parse(String xml, MxRead parserImpl) {
        return ((MxColr01000103) parserImpl.read(MxColr01000103 .class, xml, _classes));
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
     * Creates an MxColr01000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01000103 message
     * @return
     *     a new instance of MxColr01000103
     */
    public final static MxColr01000103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxColr01000103 .class);
    }

}
