
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
 * Class for colr.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "collPrpsl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.01")
public class MxColr00700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CollPrpsl", required = true)
    protected CollateralProposalV01 collPrpsl;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, Agreement2 .class, AgreementFramework1Choice.class, AgreementFramework1Code.class, CashCollateral1 .class, Collateral2 .class, CollateralMovement1 .class, CollateralMovement1Choice.class, CollateralMovement2 .class, CollateralProposal1Choice.class, CollateralProposal2 .class, CollateralProposalV01 .class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DateCode9Choice.class, DateFormat14Choice.class, DateType2Code.class, DepositType1Code.class, ExposureType1Code.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationSource3Choice.class, MxColr00700101 .class, NameAndAddress6 .class, Obligation1 .class, OtherCollateral1 .class, OtherIdentification1 .class, OtherTypeOfCollateral1 .class, PartyIdentification33Choice.class, PostalAddress2 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, Proposal1 .class, ProposalType1Choice.class, ProposalType1Code.class, SecuritiesCollateral1 .class, SecurityIdentification14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionAndDocumentIdentification3 .class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.007.001.01";

    public MxColr00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00700101(final String xml) {
        this();
        MxColr00700101 tmp = parse(xml);
        collPrpsl = tmp.getCollPrpsl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalV01 }
     *     
     */
    public CollateralProposalV01 getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalV01 }
     *     
     */
    public MxColr00700101 setCollPrpsl(CollateralProposalV01 value) {
        this.collPrpsl = value;
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
    public static MxColr00700101 parse(String xml) {
        return ((MxColr00700101) MxReadImpl.parse(MxColr00700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00700101 parse(String xml, MxRead parserImpl) {
        return ((MxColr00700101) parserImpl.read(MxColr00700101 .class, xml, _classes));
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
     * Creates an MxColr00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00700101 message
     * @return
     *     a new instance of MxColr00700101
     */
    public final static MxColr00700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00700101 .class);
    }

}
